program {
void Insertion_sort(int arr [1000] int n)
{ 
    int j
    int key
    int i  
    for (i = 1; i < n; i = i + 1) : 
    {  
        key = arr[i]
        j = i - 1
        while (j >= 0 & arr[j] > key) : 
        {  
            arr[j + 1] = arr[j]
            j = j - 1
        }  
        arr[j + 1] = key  
    }
    return
}
int Main()
{
    int n
    n = read()
    int a [100]
    int i
    for(i = 0; i < n; i = i + 1) :
    {
        a[i] = read()
    }
    Insertion_sort(a n)
    int j
    for(j = 0; j < n; j = j + 1) :
    {
        out(a[j])
        out(" ")
    }
    return 0
}
}
