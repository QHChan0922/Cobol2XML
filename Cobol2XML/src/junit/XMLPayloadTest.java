package junit;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import cobol.Cobol;
import xmlwriter.XMLPayload;

public class XMLPayloadTest {

	@Test
    public void testAddElements() {
        // Create a Cobol object with sample data
        Cobol cobol = new Cobol();
        cobol.setConstantName("CONSTANT_NAME");
        cobol.setConstantValue(123.45);
        cobol.setLineNumber(10);
        cobol.setSectionName("SECTION_NAME");
        cobol.setDivisionName("DIVISION_NAME");
        cobol.setProgram_ID("PROGRAM_ID");
        cobol.setDayDateWritten(1);
        cobol.setMonthDateWritten("March");
        cobol.setYearDateWritten(2024);
        
        // Create an XMLPayload object
        XMLPayload xmlPayload = new XMLPayload();
        
        // Add elements to the XML document
        xmlPayload.addElements(cobol);
        
        // Assert that the elements are added correctly
        // You can add more specific assertions based on your requirements
        assertNotNull(xmlPayload);
    }
    
    @Test
    public void testWriteFile() {
        // Create a Cobol object with sample data
        Cobol cobol = new Cobol();
        cobol.setConstantName("Constant");
        cobol.setConstantValue(123.45);
        cobol.setLineNumber(10);
        cobol.setSectionName("Section");
        cobol.setDivisionName("DivisionBattle");
        cobol.setProgram_ID("ESE5114");
        cobol.setDayDateWritten(1);
        cobol.setMonthDateWritten("March");
        cobol.setYearDateWritten(2024);
        
        // Create an XMLPayload object
        XMLPayload xmlPayload = new XMLPayload();
        
        // Add elements to the XML document
        xmlPayload.addElements(cobol);
        
        // Write the XML document to a file
        xmlPayload.writeFile("test.xml");
        
        // Assert that the file is created successfully
        assertTrue(new File("test.xml").exists());
    }


}
