program {
int Check_prime(int n)
{
    int i
    for(i = 2; i * i <= n; i = i + 1) :
    {
        if(n%i == 0) :
        {
            return 0
        }
    }
    return 1
}
int Main()
{
    int n
    n = read()
    int ans
    ans = 0
    int i
    for(i = 2; i < n; i = i + 1) :
    {
        if(Check_prime(i) == 1) :
        {
            ans = ans + i
        }
    }
    out(ans)
    return 0
}
}
