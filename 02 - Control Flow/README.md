# Control Flow:

###	If Else

    if(x>y && x>z)
		System.out.println(x);
	else(y>x && y>z)
		System.out.println(y);

###	If Else if

    if(x>y && x>z)
		System.out.println(x);
	else if(y>x && y>z)
		System.out.println(y);
    else
		System.out.println(z);

###	Ternary

    result = n%2==0 ? 10 : 20
    
###	Switch Statement

    int n=8;
    switch(n) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        default:
            System.out.println("Enter a valid number");			
    }