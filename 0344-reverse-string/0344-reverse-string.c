void reverseString(char* s, int sSize) {
    char a[sSize];
    int j=0;
    for(int i=sSize-1;i>=0;i--){
       a[j]=s[i];
       j++;
    }
    for(int i=0;i<sSize;i++){
        s[i]=a[i];
    }
}