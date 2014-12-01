#!/usr/java/jdk1.8.0/bin/jjs

print('ls -la');
$EXEC("ls -la");
print($OUT.trim());