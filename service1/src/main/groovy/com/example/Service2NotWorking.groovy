package com.example

import com.example.domain.Book
import io.micronaut.retry.annotation.Fallback
import io.reactivex.Flowable
import java.util.ArrayList;

@Fallback
class Service2NotWorking implements Service2Client {
    @Override
    Flowable<ArrayList<Book>> findBooks() {
        ArrayList<Book> books = new ArrayList<>();
        return Flowable.just(books)
    }
}
