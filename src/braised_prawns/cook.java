package braised_prawns;

public class cook {
	
	
	public cook (String name){
		this.oil();
		this.pourSeasoning();
		this.pourShrimps();
		this.fireShrimps();
		this.pourBeer();
		
		this.mengShrimps();
		this.eatShrimps();
		
	}
    public void  oil(){
    	
    	System.out.println("����");
    }
    
    public void pourSeasoning(){
    	int a =5;
    	int b =10;
    	
    	System.out.println("������,��"+a+"�����⣬��"+b+"������");
    }
    public void pourShrimps(){
    	
    	System.out.println("��Ϻ");
    }
    public  void fireShrimps(){
    	
    	System.out.println("��Ϻ");
    }
    
    public void pourBeer(){
    	
    	for(int i= 1;i<4;i++){
    		
    		System.out.println("��"+i+"�ε�ơ��");
    		System.out.println("��һ����");
    		
    	}
    }
    public void mengShrimps(){
    	System.out.println("�ػ�");
    }
    public void eatShrimps(){
    	System.out.println("��Ϻ");
    }
    
    
}
