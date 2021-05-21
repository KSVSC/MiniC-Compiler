program {
int Main()
{
    int n
    n = read()
    if(n == 1) :
    {
        out("no")
        return 0
    }
    bool ans
    ans = true
    int i;
    for (i = 2; i < n; i = i + 1) :
    {
        if (n % i == 0) :
        {
            ans = false
        }
    }
    if (ans == true) :
    {
        out("yes")
    }
    else : 
    {
        out("no")
    }
    return 0
}
}
