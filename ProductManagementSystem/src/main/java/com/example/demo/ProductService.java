package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	private ProductRepo prepo;

	public void addProduct(ProductDTO pto) {
		// TODO Auto-generated method stub
		 Product pdt = convertDtoToModel(pto);
         prepo.save(pdt);
	}

	
	private Product convertDtoToModel(ProductDTO ptDto) {
		Product pt = new Product();
        if (ptDto.getPid() != null) {
             pt.setPid(ptDto.getPid());
        }
        pt.setPname(ptDto.getPname());
        pt.setManuDetails(ptDto.getManuDetails());
        pt.setPrice(ptDto.getPrice());
        return pt;
  }

  private ProductDTO convertModelToDTO(Product p) {
	  ProductDTO ptDto = new ProductDTO();
      ptDto.setPid(p.getPid());
      ptDto.setPname(p.getPname());
      ptDto.setManuDetails(p.getManuDetails());
      ptDto.setPrice(p.getPrice());
      return ptDto;
  }


  public List<ProductDTO> getAllProducts() {
      List<Product> list = (List<Product>) prepo.findAll();
      ArrayList<ProductDTO> finList=new ArrayList<>();
      for(Product x:list)
      {
    	  finList.add(convertModelToDTO(x));
      }
      return finList;
}


  public void deleteProduct(String pid) {
	  prepo.deleteById(pid);
}


public ProductDTO fetchProduct(String id) {
	// TODO Auto-generated method stub
	Optional<Product> res=prepo.findById(id);
	if(res.isPresent())
	{
		Product x = res.get();
		if(x!=null)
		{
			return convertModelToDTO(x);
		}
	}
	
	return null;
}

}
