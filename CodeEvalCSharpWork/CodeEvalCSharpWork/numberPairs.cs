/*
using System;
using System.IO;

namespace CodeEvalCSharpWork
{
	public class numberPairs
	{
		public numberPairs ()
		{

			try
			{   // Open the text file using a stream reader.
				using (StreamReader sr = new StreamReader(args[0]))
				{
					// Read the stream to a string, and write the string to the console.
					String line = sr.ReadToEnd();
					String[] lines = line.Split('\n');
					foreach( String singleLine in lines){
						//Console.WriteLine (singleLine);
						// Where you start processing each line
						//Console.WriteLine ("Got to 24");
						// splits target and inputs
						String[] twoParts = singleLine.Split (';');

						String[] numberLines = twoParts[0].Split(',');
						//Console.WriteLine (numberLines[0]);
						int[] numbers = new int[ numberLines.Length];
						int target = int.Parse (twoParts[1]);
						//Console.WriteLine ("Got to 28");
						// Fills the numbers array
						for(int x=0; x < numbers.Length; x++){
							numbers[x] = int.Parse (numberLines[x]);
						}
						// Arrays filled, time to start building a list of pairs
						int  temp=0;
						//Console.WriteLine ("Got to 34");
						List<String> outputs = new List<String>();
						for(int x=0; x<numbers.Length;x++){
							temp=numbers[x];
							for(int i=x+1; i<numbers.Length;i++){
								if( temp + numbers[i] == target){
									outputs.Add (numbers[x] +","+numbers[i]);
								}
							}
						}
						//Console.WriteLine ("Got to 49");
						foreach(String print in outputs){
							if(print != outputs.Last ())Console.Write(print+";");
							else Console.Write (print);
						}
						if(outputs.Count != 0)Console.WriteLine ();
						else Console.WriteLine ("NULL");
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
*/
