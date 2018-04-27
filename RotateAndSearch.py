def bsearch(arr,low,high,key):
    mid = int((low+high)/2)
    if (low>high):
        return -1
    elif (low == high):
        return low
    elif (key == arr[mid]):
        return mid
    elif (key < arr[mid]):
        return bsearch(arr,low,mid-1,key)
    elif (key > arr[mid]):
        return bsearch(arr,mid+1,high,key)
def FindPivot(arr,low,high):
    mid = (low+high)/2
    if (low>high):
        return -1
    elif (low == high):
        return low
    elif (low == mid):
        return (mid)
    elif (mid < high and arr[mid] > arr[mid + 1]):
        
        print("Pivot found at",(mid))
        return (mid)
    elif (mid > low and arr[mid] < arr[mid-1]):
        print("Pivot found at",mid-1)
        return (mid-1)
    elif (arr[mid] > arr[low]):
        return FindPivot(arr,mid+1,high)
    return FindPivot(arr,low,mid-1)
def RotateAndSearch():
    count = 1
    ch = "y"
    flag = 1
    f = 0
    while(int(count) <= 200):
     
        
        
        if (ch == "y"):
            arr = [0]
            N = raw_input("Enter length of array:")
            g = raw_input("Enter element to be searched:")
            print("Element to be searched",g)
            
            for i in range(int(N)-1):
                arr.append(0)
            print("enter array elements one by one")
            for i in range(int(N)):
                arr[i] = input("enter element" + "" + str(i+1))
            print arr
            print ("lenth of array" + " " +str(len(arr)))
            d = FindPivot(arr,0,int(N)-1)
            if (d == -1):
                f = bsearch(arr,0,int(N)-1,g)
            elif (g > arr[0]):
                f = bsearch(arr,0,d,g)
            elif (g < arr[0]):
                f = bsearch(arr,d+1,int(N)-1,g)
            if (f == -1):
                print ("OOPS,NOT FOUND")
                flag = 0
                break
            else:
                print("Element found at",f)
        else:
            exit(0)
        print ("no. of test cases done:" + str(count))
        if (int(count) == 199):
            print "last test case remaining"
        count = count + 1
        ch = raw_input("Do you want to test more? y/n:")
        
        
RotateAndSearch()