using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace CodeEvalCSharpWork
{
    class Program
    {
        static void Main(string[] args)
        {

            try
            {   // Open the text file using a stream reader.
                using (StreamReader sr = new StreamReader(args[0]))
                {
                    // Read the stream to a string, and write the string to the console.
                    String line = sr.ReadToEnd();
					String[] lines = line.Split('\n');
					foreach( String singleLine in lines){
						// Where you start processing each line
						Console.WriteLine ("Got to 24");
						// splits target and inputs
						String[] twoParts = singleLine.Split (';');

						String[] numberLines = twoParts[1].Split(',');
						Console.WriteLine (numberLines.Length);
						int[] numbers = new int[ numberLines.Length-1 ];
						int target = int.Parse (twoParts[1]);
						Console.WriteLine ("Got to 28");
						// Fills the numbers array
						for(int x=0; x < numbers.Length; x++){
							numbers[x] = int.Parse (numberLines[x]);
						}
						// Arrays filled, time to start building a list of pairs
						int  temp=0;
						Console.WriteLine ("Got to 34");
						List<String> outputs = new List<String>();
						for(int x=0; x<numbers.Length;x++){
							temp=numbers[x];
							for(int i=0; i<numbers.Length;i++){
								if( temp + numbers[i] == target){
									outputs.Add (numbers[x] +","+numbers[i]);
								}
							}
						}
						Console.WriteLine ("Got to 49");
						foreach(String print in outputs){
							Console.WriteLine (print);
						}

					}
                }
            }
            catch (Exception e)
            {
                Console.WriteLine("The file could not be read:");
                Console.WriteLine(e.Message);
            }
        }
    }
}
