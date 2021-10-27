package task13;

import java.util.ArrayList;

import static java.lang.System.exit;

public class var3 {

    public static class Cat{
        String name;
        public Cat(String name){
            this.name=name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
    public static void output(ArrayList<var1.Cat> c)
    {
        for(int i = 0; i < c.size(); i++)
        {
            System.out.println(c.get(i).toString());
        }
        System.out.println("\n");
    }


    public static class arrayList <T>{
        private final int SIZE = 64;   //базовый размер
        private Object[] array = new Object[SIZE]; //массив для объектов классов
        private int itemPointer = 0;   //размер списка

        public void add(T Elem) // добавление элемента и проверка размерности массива (динамическое расширение)
        {
            if( itemPointer == (array.length - 1) )
                resize(array.length + 1);
            array[itemPointer] = Elem;
            itemPointer++;
        }

        public void add(int index, T Elem)
        {
            if(index >= itemPointer)
            {
                System.out.println("IndexOutOfBoundsException has been detected");
                exit(1);
            }
            if( itemPointer == (array.length - 1) )  //повторение метода add
                resize(array.length + 1);
            for(int i = itemPointer; i > index; i--)
            {
                array[i] = array[i-1];      //сдвигаем всё вправо, как и должен работать add
            }
            array[index] = Elem;
            itemPointer++;
        }
        public void remove(int index)
        {
            if(index >= itemPointer)
            {
                System.out.println("IndexOutOfBoundsException has been detected");
                exit(1);
            }
            for (int i = index; i < itemPointer; i++) {
                array[i] = array[i + 1];   //сдвигаем всё что после удаляемого элемента на 1 влево
            }
            array[itemPointer] = null;   //очищаем последнюю ячейку
            itemPointer--;
        }

        private void resize(int newLength)
        {
            Object[] newArray = new Object[newLength];
            System.arraycopy(array, 0, newArray, 0, itemPointer); //исходный массив, начальная позиция исх. массива, новый массив, позиция для вставки в новый массив, конец исх массива
            array = newArray;
        }

        public T get(int index)
        {
            return (T) array[index];
        }

        public void set(int index, T Elem)
        {
            array[index] = Elem;
        }

        public int size()
        {
            return itemPointer;
        }

        public void clear()
        {
            for(int i = 0; i < itemPointer; i++)
            {
                array[i] = null;
            }
            itemPointer = 0;
        }
    }
}
