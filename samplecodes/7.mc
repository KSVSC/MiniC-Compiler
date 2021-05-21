program {
void Util(int a [100] int n int d)
{
	int b [100]
	int c [10]
	int i
	for(i = 0; i < n; i = i + 1) :
	{
		int e 
		e = (a[i] / d) % 10
		c[e] = c[e] + 1	
	}
	int j
	for(j = 1; j < 10; j = j + 1) :
	{
		c[j] = c[j] + c[j - 1]
	}
	int k
	for(k = 9; k > 0; k = k - 1) :
	{
		c[k] = c[k - 1]
	}
	c[0] = 0
	int l
	for(l=0; l < n; l = l + 1) :
	{
		int e 
	        e = (a[i] / d) % 10
		b[c[e]] = a[i]
		c[e] = c[e] + 1
	}
	int m
	for(m = 0; m < n; m = m + 1) :
	{
		a[m] = b[m]
	}
	return
}
void Sort(int a [100] int n)
{
	int max
	max = 0
	int i
	for(i = 1; i < n; i = i + 1) :
	{
		if(a[i] > a[max]) :
		{
			max = i
		}
	}
	max = a[max]
	int j
	for(j = 1; max ; j = j * 10) :
	{
		Util(a n j)
		max = max / 10
	}
	return
}
int Main()
{
	int n
	n = read()
	int a [100]
	int i
	for(i = 0; i < n;i = i + 1) :
	{
		a[i] = read()
	}
	Sort(a n)
	int j
	for(j = 0; j < n; j = j + 1) :
	{
		out(a[j])
		out(" ")
	}
	return 0
}
}
