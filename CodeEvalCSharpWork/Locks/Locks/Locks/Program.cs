using System;
using System.IO;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Locks
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

                    foreach (String line in lines)
                    {
                        String[] values = line.Split(' ');

                        // True == locked
                        Boolean[] doors = new Boolean[Int32.Parse( values[0])];
                        int passes = Int32.Parse(values[1]),runs=0, unlocked_doors = 0;

                        Boolean evenDoor = false;
                        while (runs < passes - 1)
                        {
                            // Even's Pass
                            for (int x = 0; x < doors.Length; x++)
                            {
                                if (x % 2 != 0) doors[x] = true;
                            }
                            // 3's Pass
                            for (int x = 0; x < doors.Length; x++)
                            {
                                if (x % 3 == 2) doors[x] = !doors[x];
                            }
                            runs++;
                        }
                        doors[doors.Length - 1] = !doors[doors.Length - 1];

                        foreach( Boolean door in doors)
                        {
                            if (!door) unlocked_doors++;
                        }
                        Console.WriteLine(unlocked_doors);
                    }// End of main loop
                }

            }
            catch (Exception e)
            {
                Console.WriteLine(e);
            }
        }
    
    }
}
