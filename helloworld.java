class helloworld
{
public static void main(String[] args)
{
int a[][]=new int[2][2];
int res[][]=new int[1][2];
a[0][0]=2;
a[0][1]=4;
a[1][0]=3;
a[1][1]=5;
for(int i=0; i<2; i++)
{
for(int j=0; j<2; j++)
{
res[0][i]=res[0][i]+a[j][i];
}
for(int i=0; i<2; i++)
{
for(int j=0; j<2; j++)
{
res[0][i]=res[0][i]+a[j][i];
}

}
}
}
}