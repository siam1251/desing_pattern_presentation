public interface PersonStore {
  Person find(String name);
}
 
class DatabasePersonStore implements PersonStore {
  //...
}
 
class CsvFilePersonStore implements PersonStore {
 // ...
}
