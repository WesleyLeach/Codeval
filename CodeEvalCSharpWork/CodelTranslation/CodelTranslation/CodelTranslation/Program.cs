using System;
using System.IO;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodelTranslation
{
    class Program
    {
        static void Main(string[] args)
        {
            try
            {
                using (StreamReader fileInput = new StreamReader(args[0]))
                {
                    String input = fileInput.ReadToEnd();
                    String[] lines = input.Split('\n');
                    foreach(String line in lines)
                    {
                        Console.WriteLine(translate(line));
                    }// End of main loop;
                }
            }
            catch
            {

            }
        }// end of Main

        static String translate(String input_string)
        {
            char[] alphabet = {'a', 'b', 'c', 'd','e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y','z' };
            char[] decode_alphabet = { 'y', 'h', 'e', 's', 'x', 'v', 'g', 'h', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q' };
            char[] char_array = input_string.ToLower().ToCharArray();

            for (int y= 0; y < char_array.Length;y++)
            {
                for(int x = 0; x < alphabet.Length; x++)
                {
                    if (char_array[y] == alphabet[x]){
                        char_array[y] = decode_alphabet[x];
                        break;
                    }
                }
            }
            return new string(char_array);
        }
    }
}
