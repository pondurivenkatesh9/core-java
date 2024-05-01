# Arrays:

###	Need of an Array
    Store multiple values in one var

    int num[]= {5,6,7};
    int num[]=new int[4]; // fix the length of an array

###	Creation of Array

    int nums[]=new int[4];
    nums[0]=4;
    nums[1]=8;
    nums[2]=3;
    nums[3]=9;

###	Multi Dimensional Array

    Arrays inside Array
    
    int nums[][]=new int [3][4];
    // {{1,2,3,4}, {5,6,7,8}, {3,4,5,6}}

### Jagged and 3D Array

    Jagged Array: multi dimensional arrays with differnt sizes

    int nums[][]=new int [3][];
    nums[0]=new int [3];
    nums[1]=new int [4];
    nums[2]=new int [2];
    // {{1,2,3}, {1,2,3,4}, {1,2}}

    3D Array: Three dimensional

    int nums[][]=new int [2][3][2];
    // { {{1,2}, {2,3}, {3,4}}, {{5,6}, {4,6}, {1,3}} }

###	Drawbacks of Array

    The memory allocation is contiguous.
    The size of an array is fixed. Array size cannot be expand.
    Searching takes time.
    Array can store values of only same type. It can store homogeneous type value only.

###	Array of Objects

    Similar to nums and strings, we can also store objects in Arrays.

###	Enhanced for loop

    int num[] = {1,2,3,4}

    for loop:

        for (int i=0;i<nums.length;i++)
        {
            System.out.println(nums[i]);
        }
    
    Enhanced for loop:
    
        for(int n: nums)
        {
            System.out.println(n);
        }