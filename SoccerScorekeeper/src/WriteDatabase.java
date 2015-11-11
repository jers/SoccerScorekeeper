/* ----------------------------- */
/* TODO: Include the XStream jar */
/* ----------------------------- */

public class WriteDatabase {
	private XStream xstream;
	private String database;
	private Writer writer;

	public WriteDatabase(String database) {
		this.database = database;
		
		/* For faster XML read and write operations, we can
		 * use the XPP3 jar with the following constructor
		 * instead:
		 * new XStream();
		 */
		xstream = new XStream(new DomDriver());

		/* We can alias class names for the XML file in the
		 * following way: (This avoids bulky names in the XML)
		 */
		xstream.alias("user", User.class);
	}
	
	// Write an object o to XML, overwriting the existing file
	public int Write(Object o) throws Exception {
		// This creates the XML string
		String xml = xstream.toXML(o);

		String filePath = "file.txt";

		// Create Writer object for writing to file
		// TODO: How do we name our XML files?
		// We can have an ID attribute for each team or player object
		// Or we can make Team and Player objects inherit from a class
		// That has an ID attribute (Something like SoccerAppObject)?
		writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath), "utf-8"));
		writer.write(xml);
		writer.close();
	}

}