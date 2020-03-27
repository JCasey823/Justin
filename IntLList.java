public class IntLList extends IntList{
  private Node head;
  private Node tail;


  public IntLList(){ //constructor
    this.head = head;
    this.l = 0;
  }

  public void add(int value){
    if(head == null){
      head = new Node(value);
    }else{

      Node pres = head;
       while(pres.next != null){
         pres = pres.next;
       }
       pres.next = new Node(value);
       this.l++;


    }

  }

  public void removeLast(){
    if(head == null){
      return;
    }else{
      Node pres = head;
      int c = 0;
      while(pres.next != null){
        pres = pres.next;
        c++;
      }
      remove(c);
      this.l--;
    }
  }


  public int get(int index){
    Node pres = head;
    //index = index+1;
    for(int i = 0; i <= index-1; i++){
      pres = pres.next;
    }
    return pres.getValue();
  }

  public void set(int index, int val){
    Node pres = head;
      if(index == 0){
        head.setValue(val);
      }else{
        for(int i = 0; i < index; i++){
          pres = pres.next;
      }
    pres.setValue(val);
  }
}

  public void remove(int index) {
      Node pres = head;
      Node temp = null;
      if(index == 0){
        head = head.next;
        this.l--;
      }else{
        for(int c = 0; c < index-1; c++){
          pres = pres.next;
        }
        temp = pres.next;
        pres.next = temp.next;
        //temp = null;
        this.l--;
      }
  }

  public String toString(){
    Node pres = head;
    int c = 0;
    String str = "";
    while(pres != null){
      if(c == this.l){
        str = str + String.valueOf(pres.getValue());
        c++;
        pres = null;
      }else{
        //pres = pres.next;
        str = str + String.valueOf(pres.getValue())+", ";
        pres = pres.next;
        c++;
      }

    }
    str = "[" + str + "]";
    return str;
  }

  public void clear(){
    head = null;
    this.l = 0;

  }

}
