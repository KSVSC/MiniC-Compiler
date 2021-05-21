program {
int Math_pow(int a int e)
{
    int prod
    prod = 1
    int i
    for(i = 0; i < e; i = i + 1) :
    {
        prod = prod * a
    }
    return prod
}
int Main()
{
    int n
    n=read()
    int i
    for(i = 0; i < Math_pow(2 n); i = i + 1) :
    {
    	int j
        for(j = 0;j < n; j = j + 1) :
        {
            int k
            k = i / Math_pow(2 j)
            if(k%2 == 1) :
            {
                out(j)
                out(",")
            }
        }
        out("\n")
    }   
    return 0
}
}
