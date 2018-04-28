'''Rotate array by one in clockwise direction and then reverse it'''
def RotateAndReverse():
    
    count = 1
    ch = "y"
    while(int(count) <= 200):
     
        
        
        if (ch == "y"):
            arr = [0]
            N = raw_input("Enter length of array:")
            d = N
            f = int(N) - 1
            
            for i in range(int(N)-1):
                arr.append(0)
            print("enter array elements one by one")
            for i in range(int(N)):
                arr[i] = input("enter element" + "" + str(i+1))
            print arr
            print ("lenth of array" + " " +str(len(arr)))
                
            for i in range(1):
                    
                temp = arr[int(d)-1]
                for j in range(int(d)-2,-1,-1):
                    arr[j+1] = arr[j]
                arr[0] = temp
            print arr
            for i in range(int(N)/2):
                arr[f],arr[i] = arr[i],arr[f]
                i = int(i)+ 1
                f = int(f) - 1
            print arr
        else:
            exit(0)
        print ("no. of test cases done:" + str(count))
        if (int(count) == 199):
            print "last test case remaining"
        count = count + 1
        ch = raw_input("Do you want to test more? y/n:")
        
        
main()