import arrayList1.*;
// import linkedListList1;
import postcard.Postcard;

public class Main {
    public static void init(List L){
        //1. Создаем карточки - объекты типа Postcard, какие хотим
        //например, карточка с прекрасным именем Алина из города Нью-Йорк.
        //2. Создаём массив из этих объектов 
        //3. С помощью цикла помещаем элементы массива в список L
        //через функию insert, которая вставляет каждый раз тупо в конец
        //4. Можно вывести построчно через print();
        Postcard pc1 = new Postcard(new char[]{'a', 'l', 'i', 'n', 'a'}, new char[]{'N', 'e', 'w', ' ', 'Y', 'o', 'r', 'k'});
        Postcard pc2 = new Postcard(new char[]{'s', 'a', 's', 'h', 'a'}, new char[]{'N', 'e', 'w', ' ', 'Y', 'o', 'r', 'k'});
        Postcard pc3 = new Postcard(new char[]{'m', 'a', 's', 'h', 'a'}, new char[]{'N', 'e', 'w', ' ', 'Y', 'o', 'r', 'k'});
        Postcard pc4 = new Postcard(new char[]{'a', 'l', 'i', 'n', 'a'}, new char[]{'N', 'e', 'w', ' ', 'Y', 'o', 'r', 'k'});
        Postcard[] array = {pc1, pc2, pc3, pc4};
        for (int i = 0; i < array.length; i++) {
            L.insert(L.getEndL(), array[i]);
        }
        L.print();


    }
    public static void main(String[] args) {
            //1. Создаем объект списка - List L = new List();
            //2. инициализируем его с помощью init(L);
            //3. ставим p(позицию) как первый элемент списка;
            //4. дальше проворачиваем махинацию удаления дубликатов, 
            //которую Андрей Сергеевич когда-то написал нам на доске
//            List L = new List();
//            init(L);
//            Position p = L.getFirst();
        System.out.println("helo");


            // p, q - позиция в списке, L - список
            
            // p = L.first;
            // while (p != L.end()) {
            //     q = L.next(p);
            //     while (q != L.end()) {
            //         if (совпадает(L.retrieve(p),L.retrieve(q)))
            //             L.delete(q);
            //         else 
            //             q = L.next(q);
            //     }
            //     p = L.next(p);
            // }

            //за 'совпадает' отвечает метод isEqual(Postcard: b)
            //потом как-нибудь при реализации зафигачу его в алгоритм 

            //5. ну и печатаем обработанный результат L.print()
    }
}
