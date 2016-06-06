using System;
using System.IO;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodeCombinations
{
    class Program
    {
        static void Main(string[] args)
        {
            try
            {
                using (StreamReader fileInput = new StreamReader(args[0]))
                {
                    String fileContent = fileInput.ReadToEnd();
                    String[] lines = fileContent.Split('\n');

                    foreach (String line in lines)
                    {
                        // Main loop here
                        String[] splitLines = line.Split('|');
                        int numberOfCodes = 0;
                        // Trims out white space
                        for (int x = 0; x < splitLines.Length; x++) splitLines[x] = splitLines[x].Trim();
                        // Pull the code out for each line

                        for(int x =0; x < splitLines.Length-1; x++)
                        {
                            numberOfCodes += contains_code(splitLines[x], splitLines[x + 1]);
                        }
                        Console.WriteLine(numberOfCodes);

                    }
                }
            }
            catch( Exception e)
            {
                Console.WriteLine("The file could not be read:");
                Console.WriteLine(e.Message);
            }
        }

        static int contains_code(string lineOne,string lineTwo)
        {
            int codeCount = 0;
            String testString = "";
            for( int x=0; x<lineOne.Length-1; x++)
            {
                testString = "";
                testString = testString + lineOne[x];
                testString = testString + lineOne[x+1];
                testString = testString + lineTwo[x];
                testString = testString + lineTwo[x+1];
                testString = testString.ToLower();
                if (testString.Contains('c') && testString.Contains('o') && testString.Contains('d') && testString.Contains('e'))
                {
                    codeCount++;
                }
            }


            return codeCount;
        }
    }
}
