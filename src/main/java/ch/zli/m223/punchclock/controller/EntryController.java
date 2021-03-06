package ch.zli.m223.punchclock.controller;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import ch.zli.m223.punchclock.domain.Entry;
import ch.zli.m223.punchclock.service.EntryService;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

@Path("/entries")
public class EntryController {

    @Inject
    EntryService entryService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Entry> list() {
        return entryService.findAll();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Entry add(Entry entry) {
       return entryService.createEntry(entry);
    }

    @GET
    @Path(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Entry getSingleEntry(long id){
        return entryService.getEntryById(id);
    }

    @DELETE
    @Path("/{id}")
    public void deleteEntry(@PathParam long id){
        entryService.deleteEntry(id);
    }

    @PUT
    public void update(Entry entry){
        entryService.update(entry);
    }

}
