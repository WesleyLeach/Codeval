﻿using System;
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
					int[,] IntArray= new int[256,256];
					foreach( String singleLine in lines){
						// START OF MAIN LOOP
						String[] parts = singleLine.Split(' ');
						if(parts[0]=="SetCol"){
							for(int i=0;i<256;i++)IntArray[i,Int32.Parse(parts[1])] = Int32.Parse(parts[2]);
						}
						else if(parts[0]=="SetRow"){
							for(int i=0;i<256;i++)IntArray[Int32.Parse(parts[1]), i] = Int32.Parse(parts[2]);
						}
						else if(parts[0]=="QueryCol"){
							int temp=0;
							for(int i=0;i<256;i++)temp += IntArray[i, Int32.Parse(parts[1])];
							Console.WriteLine(temp);
						}
						else if(parts[0]=="QueryRow"){
							int temp=0;
							for(int i=0;i<256;i++)temp += IntArray[Int32.Parse(parts[1]), i];
							Console.WriteLine(temp);
						}


						// END OF MAIN LOOP
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
