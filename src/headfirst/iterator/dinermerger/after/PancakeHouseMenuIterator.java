package headfirst.iterator.dinermerger.after;
import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
    ArrayList items;
    int position = 0;
    public PancakeHouseMenuIterator(ArrayList items) {
        this.items = items;
    }
    public Object next() {
        Object object = items.get(position);
        position = position + 1;
        return object;
    }
    public boolean hasNext() {
        if (position >= items.size()) {
            return false;
        } else {
            return true;
        }
    }
}

/*import headfirst.iterator.dinermerger.before.MenuItem;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator{
  MenuItem[] items;
  int position=0;
  public PancakeHouseMenuIterator(MenuItem[] m){
    this.items=m;
  }
  public boolean hasNext(){
    if(position >= items.length){
      return false;
    } else{
      return true;
    }
  }
  public Object next(){
    MenuItem m=items[position];
    position=position+1;
    return m;
  }
}
*/