package com.hcl.gl.controller;

import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.gl.entity.Admin;
import com.hcl.gl.entity.Bills;
import com.hcl.gl.entity.FoodItems;
import com.hcl.gl.entity.Orders;
import com.hcl.gl.entity.User;
import com.hcl.gl.repository.AdminRepository;
import com.hcl.gl.service.AdminService;

@RestController
public class AdminController
{
	@Autowired
	AdminService adminService;
	@Autowired
	AdminRepository adminRepository;
	
	@PostMapping("/register")
    public void registerAdmin(@RequestBody Admin newAdmin)
    {
       
		List<Admin> admins = (List<Admin>) adminRepository.findAll();
        System.out.println("New admin:"+newAdmin.toString());
        for(Admin admin : admins )
        {
            if(admin.equals(newAdmin))
            {
                System.out.println("Admin exists!");
                return ;
            }
        }
    }
	
	@PostMapping("/login")
    public void loginAdmin(@RequestBody Admin admin)
    {
        List <Admin> admins=(List<Admin>) adminRepository.findAll();
        for(Admin loginadmin:admins)
        {
            if(loginadmin.equals(admin))
            {
                return;
            }
        }
    }
	
	@PostMapping("/logout")
    public void logoutAdmin(@RequestBody Admin admin)
    {
         List <Admin> admins = (List<Admin>) adminRepository.findAll();
         for(Admin loginadmin : admins)
         {
             if(loginadmin.equals(admin))
             {
            	 return;
             }
         }
     }

	@PostMapping("/admin/addFoodItems/")
	public FoodItems addFoodItems(@RequestBody FoodItems fooditems)
	{
		return adminService.addFoodItems(fooditems);
	}

	@GetMapping("/admin/getFoodItems/{foodId}")
	public FoodItems getFoodItemsById(@PathVariable int foodId)
	{
		return adminService.getFoodItemsById(foodId);
	}

	@PutMapping("/admin/updateFoodItems/")
	public FoodItems updateFoodItems(@RequestBody FoodItems foodItems){
		return adminService.updateFoodItems(foodItems);
	}

	@DeleteMapping("/admin/deleteFoodItems/")
	public FoodItems deleteFoodItemsById(@PathVariable int foodId)
	{
		return adminService.deleteFoodItemsById(foodId);
	}

	@GetMapping("/user/{userid}")
	public User getUser(@PathVariable("userid")int userid)
	{
		return adminService.getUserById(userid);

	}

	@DeleteMapping("/user/{userid}")
	public void deleteUser(@PathVariable("userid")int userid)
	{
		adminService.deleteUser(userid);
	}

	@PostMapping("/user")
	public int saveUser(@RequestBody User user)
	{
		adminService.saveOrUpdate(user);
		return user.getUserId();
	}

	@GetMapping("/admin/getorder/{userid}")
	public List<Orders> getOrdersById(@PathVariable int userid){
		return adminService.getOrdersById(userid);
	}

	@GetMapping("/admin/get-todays-bills/{date}")
	public List<Bills> getBills(@PathVariable String date){
		return adminService.getBills(LocalDate.parse(date));
	}

}
