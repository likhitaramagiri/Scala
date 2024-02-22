object helloworld {
def main(args:Array[String]):Unit={
  for(i<- 5 to 1 by -1) {
    for(j<-i to 1 by -1) {
      print(j + " ")
    }
    println("")
  }

}
}
