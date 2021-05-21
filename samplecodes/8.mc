program {
void Merge(int a [500] int l int r)
{
	int m 
        m = (l + r) / 2
	int tmp [500]
	int i
        i = l
	int j
        j = m + 1
	int k 
        k = 0
	while(i <= m & j <= r) :
	{
		if(a[i] < a[j]) :
		{
			tmp[k] = a[i]
			i = i + 1
			k = k + 1
		}
		else :
		{
			tmp[k] = a[j]
			j = j + 1
			k = k + 1
		}
	}
	while(i <= m) :
	{
		tmp[k] = a[i]
		i = i + 1
		k = k + 1
	}
	while(j <=r) :
	{
		tmp[k] = a[j]
		j = j + 1
		k = k + 1
	}
	k = 0
	for(int i = l; i <= r; i = i + 1) :
	{
		a[i] = tmp[k]
		k = k + 1
	}	
	return
}
void Mergesort(int a [500] int l int r)
{
	if(l < r) :
	{
		int m 
        	m = (l + r) / 2
		Mergesort(a l m)
		Mergesort(a m + 1 r)
		Merge(a l r)
	}
	return
}
int Main()
{
	int n
	n = read()
	int a [500]
	int i
	for(i = 0; i < n; i = i + 1) :
	{
		a[i] = read()
	}
	Mergesort(a 0 n - 1)
	int j
	for(int j = 0; j < n; j = j + 1) :
	{
		out(a[j])
		out(" ")
	}
	return 0
}
}
