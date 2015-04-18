// create Java String array of 5 elements
var a = java.lang.reflect.Array.newInstance(java.lang.String.class, 5);

// Accessing elements and length access is by a usual syntax
a[0] = "scripting is great!";
print(a.length);

print('\n\nIterating \'a\' array in .js');
for( i in a){
    print(a[i]);
}
print('For each iter');
for each (i in a){
    print(i);
}

var b = ['a', 'b', 'c', 'd'];

print('\n\n\nIterating \'b\' array in .js');
for( i in b){
    print(b[i]);
}
print('For each iter');
for each (i in b){
    print(i);
}

print('\n\nPrinting \'a\' array in Java');
printer.printArray(a);

print('\n\nPrinting \'b\' array in Java');
printer.printArray(b);


print('\n\n\n\nFun with lists!');

for each (tweet in data){
    print(tweet);
}

print(data.length);