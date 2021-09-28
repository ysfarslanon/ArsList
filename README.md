# ArsList

Java'da generic yapısını kullanarak verileri tutuğumuz bir sınıf tasarlıyorum.
Sınıfın amacı içerisinde dinamik bir Array tutması ve veri tipini dinamik olarak alması.

# Sınıfın özellikleri
- Sınıfın varsayılan boyutu 10 olarak belirlendi ve eleman sayısı ihtiyaç duyuldukça sınıfın kapasitesini 2 katına çıkmaktadır.
- Sınıfa ait 2 adet constructor vardır.
- ArsList(): Boş constructor kullanıldığında dizinin başlangıç kapasitesi 10 olarak belirlenir.
- ArsList(int capacity): Dizinin başlangıç kapasitesini capacity parametrisi belirler.
- size(): Dizinin eleman sayısını int türünde döndürür.
- getCapacity(): Dizinin kapasitesinin int türünde döndürür.
- add(T data): Sınıfa ait diziye eleman eklemek için kullanılır. Eğer dizide yeterli kadar kapasite yoksa dizi kapasitesi 2 katına çıkmaktatır.
- get(int index): Verilen indisdeki değeri T türünden değeri döndürür. Geçersiz indis girildiğinde null döndürür.
- remove(int index): Verilen indisdeki T türünden değeri siler. Silme işleminden sonra veriler sola doğru indis değişimi olur. Geçersiz indis girildiğinde null döndürür.
- set(int index, T data):Verilen indisdeki veriyi T türünden yenisi ile değiştirir.  Geçersiz indis girildiğinde null döndürür.
- String toString(): Sınıfı ait dizideki elemanları listeler. (Örnek: [10,20,30] )
- int indexOf(T data): T türünden verilen değerin indeksini verir. T türünden veri yoksa -1 döndürür.
- int lastIndexOf(T data): T türünden verilen değerin son indisdeki döndürür. T türünden veri yoksa -1 döndürür.
- boolean isEmpty(): T türündeki liste boş ise true, doluysa false döndürür.
- T[] toArray():  Listedeki öğeleri aynı sırayla bir T türünden array döndürür.
- clear(): Listedeki bütün öğeleri siler, boş bir liste haline getirir.
- ArsList<T> sublist(int start, int finish): Parametleyle verilen start ve finish indisleri aralığında ait bir liste döner.
 - boolean contains(T data): Parametleyle alınan T türündeki değerin listede varsa true, yoksa false döndürür. 
