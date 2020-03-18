    <%-- 
    Document   : addService
    Created on : Jul 11, 2019, 8:16:56 PM
    Author     : HP
--%>
<%@page import="Test.*,java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="getService.jsp" method="post" enctype="multipart/form-data">
			
			<div class="ads-info" >
				<div class="row">
					<div class="col-md-8">
						<div class="my-ads section">
							<h2>My Services</h2>
							<!-- ad-item -->
							<div class="form-group">
									<label>Category</label>
									<div class="dropdown category-dropdown">						
							 
                                                        <select name="category">
							<%
                                                                    service_provider_dao dao=new service_provider_dao();
                                                                    
                                                                    java.util.ArrayList<category_pojo> data=dao.category_fetch();
                                                                     for(category_pojo d :data)
                                                                     { 
                                                                     
                                                            %>
                                                           
                                                            <option>
                                                                <%= d.getCategory()%>
                                                            </option>
                                                            
                                                            <%}%>
								
                                                       	</select>							
						</div>
								</div>

								<div class="form-group">
									<label>Service Name</label>
									<input type="text" class="form-control" name="serviceName" placeholder="Service Name">
								</div>

								<div class="form-group">
									<label for="name-three">Service Description</label>
									<input type="text" class="form-control" name="serviceDescription" placeholder="Service Description">
								</div>
                                                                
                                                                <div class="form-group">
									<label for="name-three">Service Charges</label>
									<input type="number" class="form-control" name="serviceCharges" placeholder="Service Charges">
								</div>
                                                                
                                                                <div class="form-group">
									<label for="name-three">Available Days</label>
                                                                        <input type="text" class="form-control" name="availableDate" placeholder="Available Days">
								</div>
                                                        
                                                                <div class="form-group">
									<label for="name-three">Available Days</label>
                                                                        <select multiple="" class="form-control" name="txtdays">
                                                                            <option>Monday</option>
                                                                            <option>Tuesday</option>
                                                                            <option>Wednesday</option>
                                                                            <option>Thursday</option>
                                                                            <option>Friday</option>
                                                                            <option>Saturday</option>
                                                                            <option>Sunday</option>
                                                                        </select>
								</div>
                                                                
                                                                <div class="form-group">
									<label for="name-three">Available Starting Time</label>
									<input type="time" class="form-control" name="availableStartingTime" placeholder="Available Starting Time">
								</div>
                                                                
                                                                <div class="form-group">
									<label for="name-three">Available Ending Time</label>
                                                                        <input type="time" class="form-control" name="availableEndingTime" placeholder="Available Ending Time">
								</div>
                                                        
                                                                <div class="form-group">
									<label for="name-three">Service Duration</label>
                                                                        <select class="form-control" name="duration">
                                                                            <option>30 Min</option>
                                                                            <option>1 hr</option>
                                                                            <option>1 hr 30 Min</option>
                                                                            <option>2 hr</option>
                                                                        </select>
								</div>
                                                                
                                                                <div class="form-group">
									<label for="name-three">Location</label>
                                                                        <input type="text" class="form-control" name="location" placeholder="Location">
								</div>
                                                                
                                                                <div class="form-group">
									<label for="name-three">Photo</label>
                                                                        <input type="file" class="form-control" name="photo" placeholder="Photo">
								</div>
                                                        <!-- ad-item -->

							<!-- ad-item -->
							<!-- ad-item -->
						</div>
					</div><!-- my-ads -->
                                       

					<!-- recommended-cta-->
					<!-- recommended-cta-->				
					
				</div><!-- row -->
			</div><!-- row -->
                         
                        <button type="submit" class="btn btn-primary">Add Service</button>

                        </form>
    </body>
</html>
