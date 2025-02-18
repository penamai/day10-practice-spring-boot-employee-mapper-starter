package com.afs.restapi.controller;

import com.afs.restapi.service.CompanyService;
import com.afs.restapi.service.dto.CompanyRequest;
import com.afs.restapi.service.dto.CompanyResponse;
import com.afs.restapi.service.dto.EmployeeResponse;
import com.afs.restapi.service.mapper.CompanyMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/companies")
public class CompanyController {

    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping
    public List<CompanyResponse> getAllCompanies() {
        return companyService.findAll().stream()
                .map(CompanyMapper::toResponse)
                .collect(Collectors.toList());
    }

    @GetMapping(params = {"pageNumber", "pageSize"})
    public List<CompanyResponse> getCompaniesByPage(@RequestParam Integer pageNumber, @RequestParam Integer pageSize) {
        return companyService.findByPage(pageNumber, pageSize);
    }

    @GetMapping("/{id}")
    public CompanyResponse getCompanyById(@PathVariable Long id) {
        return companyService.findById(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCompany(@PathVariable Long id, @RequestBody CompanyRequest companyRequest) {
        companyService.update(id, companyRequest);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCompany(@PathVariable Long id) {
        companyService.delete(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CompanyResponse createCompany(@RequestBody CompanyRequest companyRequest) {
        return companyService.create(companyRequest);
    }

    @GetMapping("/{id}/employees")
    public List<EmployeeResponse> getEmployeesByCompanyId(@PathVariable Long id) {
        return companyService.findEmployeesByCompanyId(id);
    }

}
