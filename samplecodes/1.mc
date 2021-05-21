program {
int Math_pow(int a int e)
{
    int prod
    prod = 1
    int i
    for(i=0; i < e; i = i + 1) :
    {
        prod = prod * a 
    }
    return prod 
}
int G(int n int k)
{
    int sum 
    sum = 0
    int i
    for(i = 0; i < n; i = i + 1) :
    {
        sum = sum + Math_pow(i k)
    }
    return sum
}
int Main()
{
    int n
    int k
    n = read()
    k = read()
    int result 
    result = G(n k)
    out(result)
    return 0
}
}
