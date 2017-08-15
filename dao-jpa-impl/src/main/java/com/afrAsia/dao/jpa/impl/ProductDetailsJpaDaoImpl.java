package com.afrAsia.dao.jpa.impl;

import java.util.List;

import javax.persistence.Query;

import com.afrAsia.dao.jpa.ProductDetailsJpaDao;
import com.afrAsia.entities.jpa.ProductDetails;

public class ProductDetailsJpaDaoImpl extends BaseJpaDAOImpl<Long, ProductDetails> implements ProductDetailsJpaDao{
	
	public List<Long> getId(Long id){
		Query query = getEntityManager().createQuery("select pd.id from ProductDetails pd "
				+ "where pd.id=:productId");
		query.setParameter("productId", id);
		
		List<Long> detailsByefault = query.getResultList();
		return detailsByefault; 
	}
	
	//for get Product Details id 
	public List<Object> getProductById(Long productID) {
		/*String queryString = "select * from MOB_PROD_DETAILS where ID="+productID;
		SQLQuery query = (SQLQuery) getEntityManager().createQuery(queryString);

		List<ProductDetails> listOfEntries = query.addEntity(ProductDetails.class).list();*/

		String queryString = "select pd.id,pd.feature,pd.longDescription,pd.infoLink,pd.imageURL FROM ProductDetails pd WHERE pd.id=:pid";
		Query query = getEntityManager().createQuery(queryString);
		query.setParameter("pid", productID);
		List<Object> plist= query.getResultList();

		for (Object object : plist) {
			System.out.println("#####	inside dao impl for loop ");
			Object[] outputs = (Object[]) object;
			System.out.println("id in dao impl for loop :  "+outputs[0].toString());
			System.out.println("feature in dao impl for loop  : "+outputs[1].toString());
			System.out.println("LongDescription in dao impl for loop  : "+outputs[2].toString());
			System.out.println("InfoLink in dao impl for loop  : "+outputs[3].toString());
			System.out.println("ImageURL in dao impl for loop  : "+outputs[4].toString());
		}
		
		return plist;
	}
}

