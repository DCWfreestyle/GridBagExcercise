
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class gbe extends Frame {

	Panel p,pb;
	
	Label l1,l2,l3,l4;
	TextField tf1,tf2,tf3;
	CheckboxGroup cbg;
	Checkbox cb1,cb2,cb3,cb4;
	Button bt1,bt2;
	GridBagLayout gb;
	GridBagConstraints gbc;
	public gbe(String t){
		super(t);
		l1= new Label("用户名");
		l2= new Label("密码");
		l3= new Label("重复密码");
		l4= new Label("获取途径");
		
		tf1 = new TextField(20);
		tf2 = new TextField(20);
		tf3 = new TextField(20);
		
		gb = new GridBagLayout();
		setLayout(gb);
		gbc = new GridBagConstraints();
		p=new Panel();
		pb =new Panel();
		
		cbg = new CheckboxGroup();
		cb1=new Checkbox("搜索",cbg,true);
		cb2=new Checkbox("广告",cbg,false);
		cb3=new Checkbox("朋友",cbg,false);
		cb4=new Checkbox("其它",cbg,false);
		bt1=new Button("提交");
		bt2=new Button("重置");
		
		gbc.fill=GridBagConstraints.ABOVE_BASELINE;
		//开始向FRAME添加  X,Y,Height,Width
		adc(l1,0,0,1,1);
		adc(tf1,0,2,1,4);
		adc(l2,1,0,1,1);
		adc(tf2,1,2,1,4);
		adc(l3,2,0,1,1);
		adc(tf3,3,2,1,4);
		adc(l4,4,0,1,1);
		adc(p,4,2,1,1);
		adc(pb,5,2,1,5);
		p.add(cb1);
		p.add(cb2);
		p.add(cb3);
		p.add(cb4);
		pb.add(bt1);
		pb.add(bt2);
		
		//菜单-----------------------
				MenuBar mb =new MenuBar();
				setMenuBar(mb);
				MenuItem m1 = new MenuItem("File");
				MenuItem m2 =new MenuItem("Edit");
				MenuItem m3 = new MenuItem("help");
				mb.add(m1);
				mb.add(m2);
				mb.setHelpMenu(m3);
				
				Menu mi1 = new Menu("Save");
				Menu mi2 = new Menu("Load");
				Menu mi3 = new Menu("Quit");
				m1.add(mi1);
				m1.add(mi2);
				m1.addSeparator();
				m1.add(mi3);
		//-----------------------------
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent evt){
				dispose();
				System.exit(0);
			}
		});
	}
	//添加组件
	public void adc(Component c ,int row,int col,int nrow,int ncol){
		gbc.gridx=col;
		gbc.gridy=row;
		gbc.gridheight=ncol;
		gbc.gridwidth=nrow;
		gb.setConstraints(c,gbc);
		add(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gbe tg = new gbe("网格包布局管理器");
		tg.setSize(500,350);
		tg.setVisible(true);
		
	}

}
