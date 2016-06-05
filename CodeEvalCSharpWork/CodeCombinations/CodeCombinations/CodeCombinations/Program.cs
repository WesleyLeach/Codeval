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
                        for
                        Console.WriteLine(splitLines);
                    }
                }
            }
            catch( Exception e)
            {
                Console.WriteLine("The file could not be read:");
                Console.WriteLine(e.Message);
            }
        }
    }
}
