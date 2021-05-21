program {
int Main()
{
    int count
    count = 0
    int z
    for (z = 1; z < 100000000; z = z + 1) :
    {
    	int x
        for (x = 1; x < z; x = x + 1) :
        {
            int y
            for (y = 1; y < z - x; y = y + 1) :
            {
                if (x*x + y*y == z*z) :
                {
                    count = count + 1
                }
            }
        }
    }
    out(count)
    return 0
}
}
