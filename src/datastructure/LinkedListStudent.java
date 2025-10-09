package datastructure;

public class LinkedListStudent {
    private NodeStudent head;

    public static void main(String[] args) {
        LinkedListStudent list = new LinkedListStudent();

        list.addStudent(new Student(1, "Joni", "CS"));
        list.addStudent(new Student(2, "Leman", "IT"));
        list.addStudent(new Student(3, "Tony", "AI"));
        System.out.println("After adding students:");
        list.display();
    }

    public void addStudent(Student studentData) {
        NodeStudent newNode = new NodeStudent(studentData);

        if (head == null) {
            head = newNode;
            return;
        }

        NodeStudent currentNode = head;
        while (currentNode.nextStudent != null) {
            currentNode = currentNode.nextStudent;
        }
        currentNode.nextStudent = newNode;
    }

     public void display() {
        NodeStudent currentNode = head;

        while (currentNode != null) {
            System.out.println(currentNode.studentData);
            currentNode = currentNode.nextStudent;
        }
     }

     public void update(int id, Student updatedData) {
        NodeStudent currentNode = head;

        while (currentNode != null) {
            if (currentNode.studentData.getStudentId() == id) {
                currentNode.studentData = updatedData;
                return;
            }
            currentNode = currentNode.nextStudent;
        }
     }

     public void delete(int id) {
        NodeStudent currentNode = head;
        NodeStudent previousNode = null;

        while (currentNode != null && currentNode.studentData.getStudentId() != id) {
            previousNode = currentNode;
            currentNode = currentNode.nextStudent;
        }

        if (previousNode != null && currentNode != null) {
            previousNode.nextStudent = currentNode.nextStudent;
        }
     }
}

class NodeStudent {
    Student studentData;
    NodeStudent nextStudent;

    public NodeStudent(Student studentData) {
        this.studentData = studentData;
        this.nextStudent = null;
    }
}



class Student {
    private int studentId;
    private String studentName;
    private String studentCourse;

    public Student(int studentId, String studentName, String studentCourse) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentCourse = studentCourse;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(String studentCourse) {
        this.studentCourse = studentCourse;
    }

    @Override
    public String toString() {
        return "ID: " + studentId + ", Name: " + studentName + ", Course: " + studentCourse;
    }
}
