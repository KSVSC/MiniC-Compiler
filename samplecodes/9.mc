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
	for(i = 0;i < m1; i = i + 1) :
	{
		int j
		for(j=0; j < n1; j = j + 1) :
		{
			mat1[i][j] = read()
		}
	}
	int k
    	for(k = 0; k < m1; k = k + 1) :
	{
		int s
        	for(s = 0; s < n1; s = s + 1) :
		{
        	    mat2[k][s] = read()
        	}
    	}
	if(m1 != m2 | n1 != n2) :
	{
		out(-1)
		return 0
	}
	int l
	for(l = 0; l < m1; l = l + 1) :
	{
		int p
		for(p = 0; p < n1; p = p + 1) :
		{
			int val 
        	    val = mat1[l][p] + mat2[l][p]
        	    out(val)
        	    out(" ")
		}
		out("\n")
	}
	return 0
}
}	
