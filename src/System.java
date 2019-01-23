public class System
{
    public static void main(String...args)
    {
        java.lang.System.out.println("Munction RMI Coprocessor");

        //

        Munction munction = new Munction();

        //

        munction.builder.run();     // create the document(s)

        munction.enhancer.run();    // add metadata, backend(s) to documents etc

        munction.persistor.run();   // add documents to disk, database, etc.

        munction.connector.run();   // add the connector between the RMI engine and documents
    }
}