package com.niit.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.niit.config.HibernateUtil;
import com.niit.models.Student;

public class LoginDaoImpl implements LoginDao {
	public Student validUser(String uName,String pwd) {
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			Transaction tx = session.beginTransaction();
			//List result = session.createQuery("from Stuent where userId = userName").setParameter("username", uname).list();
			Criteria criteria = session.createCriteria(Student.class);
			criteria.add(Restrictions.eq("uId", uName)).add(Restrictions.eq("pwd",pwd));
			List<Student>result = criteria.list();
			tx.commit();
			int flag = 0;
			Student student = new Student();
			for(Student stud : result)
			{
				if(stud.getuId().equals(uName) && stud.getpwd().equals(pwd))
				{
					flag = 1;
					student.setdob(stud.getdob());
					student.setfName(stud.getfName());
					student.setlName(stud.getlName());
					student.setemail(stud.getemail());
					student.setaddress(stud.getaddress());
					student.setgender(stud.getgender());
					student.setmobileNo(stud.getmobileNo());
					student.setpwd(stud.getpwd());
					student.setuId(stud.getuId());
					break;	
				}
			}
			if(flag==1)
			{
				return student;
			}
			else
			{
				return null;
			}
		  }
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
		
	}
	
}
