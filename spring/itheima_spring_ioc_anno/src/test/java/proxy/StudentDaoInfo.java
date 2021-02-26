package proxy;

public interface StudentDaoInfo {
    public void add(String name);
    public int del(int id);
    public String update(String name,int id);
    public String sel(int id);
}
