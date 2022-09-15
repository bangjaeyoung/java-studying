package chapter2.ch11;

public class MakeReport {

    StringBuffer buffer = new StringBuffer();

    private String line = "--------------------------------------------\n";
    private String title = "이름\t  주소\t\t  전화번호\n";
    
    private void makeHeader() {
        buffer.append(line);
        buffer.append(title);
        buffer.append(line);
    }

    private void generateBody() {
        buffer.append("James\t");
        buffer.append("Seoul Korea\t");
        buffer.append("010-2222-3333\n");
    }

    private void makeFooter() {
        buffer.append(line);
    }

    public String getReport() {
        makeHeader();
        generateBody();
        makeFooter();
        return buffer.toString();
    }
}
// 숨길 메서드는 private으로 숨기고, 마지막에 public 메서드로 숨길 메서드를 실행하도록 만듬