using System;
using System.Text.RegularExpressions;
using System.IO;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EmailValidation
{
    class Program
    {

        public static Regex ValidationRegex = new Regex("^(\\.?[0-9a-z]*?\\.?)*@([0-9a-z]*?)(\\.?[0-9a-z]*?)*$", RegexOptions.IgnoreCase);

        static void Main(string[] args)
        {
            try
            {
                using (StreamReader fileReader = new StreamReader(args[0]))
                {
                    String Input_line = fileReader.ReadToEnd();
                    String[] lines = Input_line.Split('\n');

                    foreach(String line in lines)
                    {
                        Console.WriteLine(ValidationRegex.IsMatch(line)  ? "true" : "false");
                    }
                }
            }
            catch ( Exception e)
            {
                Console.WriteLine(e);
            }
        }
    }
}
