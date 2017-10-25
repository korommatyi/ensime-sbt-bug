# Steps to reproduce

1) Put Spark 2.2.0 under ~/spark-2.2.0
2) Create .ensime file

# Problem description

- Emacs reports false errors when opening src/main/scala/org/something/Something.scala
- The spark jars don't show up under :compile-deps in the .ensime file
