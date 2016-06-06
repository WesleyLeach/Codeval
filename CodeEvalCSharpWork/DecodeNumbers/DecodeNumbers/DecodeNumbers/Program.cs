using System;
using System.IO;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DecodeNumbers
{
    class Program
    {
        static void Main(string[] args)
        {
            try
            {
                using (StreamReader fileReader = new StreamReader(args[0]))
                {
                    String inputText = fileReader.ReadToEnd();
                    String[] lines = inputText.Split('\n');

                    foreach(String line in lines)
                    {
                       
                        Console.WriteLine(number_of_combinations(line.Trim()));
                    }
                }
                
            }
            catch( Exception e)
            {
                Console.WriteLine(e);
            }
        }

        static int number_of_combinations(String raw_input)
        {
            int combinations = 0, x=0;
            Boolean alreadyConsumed = false;
            while(x < raw_input.Length)
            {
                if( raw_input[x].Equals('1') && (x+1 <raw_input.Length) && !alreadyConsumed)
                {
                    if (raw_input[x + 1].Equals('2') || raw_input[x + 1].Equals('1'))
                    {
                        alreadyConsumed = true;
                        combinations += 2;
                        x+=2;
                    }
                    else
                    {
                        combinations += 2;
                        x++;
                    }

                }
                else if (raw_input[x].Equals('2') && (x + 1 < raw_input.Length) && !alreadyConsumed)
                {
                    if (raw_input[x + 1].Equals('2') || raw_input[x + 1].Equals('1'))
                    {
                        alreadyConsumed = true;
                        combinations += 2;
                        x+=2;
                    }
                    else
                    {
                        combinations += 2;
                        x++;
                    }

                }
                else if(!raw_input[x].Equals('0'))
                {
                    if(raw_input[x].Equals('1') || raw_input[x].Equals('2'))
                    {
                        if (!alreadyConsumed)
                        {
                            combinations++;
                            x++;
                        }
                        else
                        {
                            x++;
                        }
                    }
                    else
                    {
                        combinations += 1;
                        x++;
                    }

                }
                else
                {
                    x++;
                }
            }
            
            return combinations;
        }
    }
}
