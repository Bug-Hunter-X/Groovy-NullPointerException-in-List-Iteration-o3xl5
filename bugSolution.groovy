```groovy
def myMethod(List<String> list) {
  if (list != null) {
    list.each { element ->
      println element
    }
  } else {
    println "List is null"
  }
}

myMethod(null)
myMethod(['a', 'b', 'c'])