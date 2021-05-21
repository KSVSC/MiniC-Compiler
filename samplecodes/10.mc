program {
int Main()
{
    int mat1 [100][100]
    int mat2 [100][100]
    int m1 
    m1 = read()
    int n1 
    n1 = read()
    int m2 
    m2 = read()
    int n2 
    n2 = read()
    int i
    for(i = 0; i < m1; i = i + 1) :
    {
	int j
        for(j = 0; j < n1; j = j + 1) :
        {
            mat1[i][j] = read()
        }
    }
    int k
    for(k = 0; k < m1; k = k + 1) :
    {
    	int l
        for(l = 0; l < n1; l = l + 1) :
        {
            mat2[k][l] = read()
        }
    }
	if(n1 != m2) :
    {
		out(-1)
		return 0
	}
	int ans [100][100]
	int m
	for(m = 0; m < m1; m = m + 1) :
    {
    		int p
		for(p = 0; p < n2; p = p + 1) :
        {
        int q
			for(q = 0; q < n1; q = q + 1) :
            {
				ans[m][p] = ans[m][p] + mat1[m][q] * mat2[q][p]
			}
            out(ans[m][p])
            out(" ")
		}
	}
	return 0
}
}
