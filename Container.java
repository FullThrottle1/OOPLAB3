public class Container<T>{
    private static final int DEFAULT_CAPACITY = 5;

    private int size;
    private int capacity;
    private Object[] internalArray;

    public Container(){
        this.capacity = DEFAULT_CAPACITY;
        internalArray = new Object[this.capacity];
    }

    public Container(int capacity){
        this.capacity = capacity;
        internalArray = new Object[this.capacity];
    }

    public T get(int index){
        return (T) this.internalArray[index];
    }

    public void set(int index, T value){
        this.internalArray[index] = value;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public int size(){
        return this.size;
    }

    private void resize(){
        int newCapacity = this.capacity * 2;
        Object[] resizedArray = new Object[newCapacity];

        for (int i = 0; i < this.size; i++) {
            resizedArray[i] = this.internalArray[i];
        }

        this.internalArray = resizedArray;
        this.capacity = newCapacity;
    }

    public void add(T value){
        if (this.capacity == this.size) {
            resize();
        }

        internalArray[this.size] = value;
        this.size++;
    }

    public void addFirst(T value){
        if (this.capacity == this.size) {
            resize();
        }

        shiftUpFromIndex(0);
        internalArray[0] = value;
        this.size++;
    }

    public void insert(T value) {

        if (this.capacity == this.size) {
            resize();
        }
        int position = this.size / 2;
        shiftUpFromIndex(position);
        internalArray[position] = value;
        this.size++;
    }

    private void shiftUpFromIndex(int index) {
        for (int i = this.size; i > index; i--) {
            internalArray[i] = internalArray[i - 1];
        }
    }

    public void remove(int index) {
        if (index != this.size) {
            shiftDownToIndex(index);
        }
        this.internalArray[this.size] = null;
        size--;
    }

    private void shiftDownToIndex(int index) {
        for (int i = index; i < this.size; i++) {
            internalArray[i] = internalArray[i + 1];
        }
    }

    public void delete(int index){
        if (index < this.size && index > 0) {
            this.internalArray[index] = null;
        }
    }
}