# Groovy NullPointerException in List Iteration
This example demonstrates a common NullPointerException in Groovy when dealing with lists. The `myMethod` function iterates over a list; however, if a null list is passed, a `NullPointerException` occurs because the `each` method cannot be invoked on null.

**Problem:**
The `myMethod` function does not handle the case where the input `list` is null. 

**Solution:**
The solution involves checking for null before performing the iteration.